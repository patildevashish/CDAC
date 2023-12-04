import { Header } from "./Header";
import { Content } from "./Content";
import { Footer } from "./Footer";
export function Main() 
{
    function showDetails() {
        alert("Hello");
    }
    const person = {name:"Deva",age:22};
    const names=[
        {name:"Devashish",Age:22,Mobile:89745632},
        {name:"Kshitij",Age:27,Mobile:987456321},
        {name:"Mahesh",Age:26,Mobile:123456789}
    ]

    function printName(name) 
    {  
        alert("Name:"+name)
    }
    return(
        <div>
            <Header person={person} showDetails={showDetails} names={names}/>
            <Content printName={printName}/>
            <Footer/>
        </div>
    );
}