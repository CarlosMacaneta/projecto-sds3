import Dashboard from "pages/Dashboard";
import Home from "pages/Home";
import { BrowserRouter, Route, Switch } from "react-router-dom";

const Routes = () => {
    return (
        //definindo estrutura de rotas
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/dashboard">
                    <Dashboard />
                </Route>
            </Switch>
        </BrowserRouter>
    );
} 

export default Routes;