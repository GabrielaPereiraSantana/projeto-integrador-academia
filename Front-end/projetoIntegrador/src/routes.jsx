import { createBrowserRouter } from "react-router-dom";
import {Home} from "./paginas/Home"


export const routes = createBrowserRouter([
    {
        path: "/",
        element:<Home/>
    }
])
