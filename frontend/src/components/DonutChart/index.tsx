import axios from "axios";
import { useEffect, useState } from "react";
import Chart from "react-apexcharts";
import { SaleSum } from "types/sale";
import { BASE_URL } from "utils/request";

/*
tipo local
usaremos este tipo para popular o donut chart
*/
type ChartData = {
    labels: string[];
    series: number[];
}

const DonutChart = () => {

    /*Hook: useState
     *Manter estado no componente
     *const[stateName, function]
    */
    const [chartData, setChartData] = useState<ChartData>({labels: [], series: []})


    //fazendo uma requisicao
    /*
     *Hook: useEffect
     *Executar algo na instanciação ou destruição do componente, observar estado 
     *useEffect(funcao a ser executada, lista de objetos que será objservada)
     */
    useEffect(() => {
        axios.get(`${BASE_URL}/sales/amount-by-seller`)
        .then(response => {
            const data = response.data as SaleSum[];
            const myLabels = data.map(x => x.sellerName)
            const mySeries = data.map(x => x.sum)

            setChartData({labels: myLabels, series: mySeries})
        })
    }, [])
    
    const options = {
        legend: {
            show: true
        }
    }
    
    return (
        <Chart 
            options = {{ ...options, labels: chartData.labels }}
            series = {chartData.series}
            type = "donut"
            height = "240"
        />
    );
}

export default DonutChart;