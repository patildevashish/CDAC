import { useState } from "react";
export function Content(props) {
    const [name, setName] = useState("")
    const [num1, setNum1] = useState(0);
    const [num2, setNum2] = useState(0);
    const [add, setAdd] = useState(0);



    return (
        <div>
            <div className="alert alert-light" style={{ height: "30vh", backgroundColor: "navy", color: "white" }}>
                <p>
                    This is Content!
                </p>

                <input type="text" value={name} onChange={function (event) {
                    setName(event.target.value)
                }} />
                &nbsp;
                <button className="btn btn-info" onClick={function () {
                    props.printName(name)
                }}>Your Name</button>
            </div>

            <div className="alert alert-primary">
                <h1>{num1+num2}</h1>
                <input type="number" value={num1} onChange={function (event) {
                    setNum1(parseInt(event.target.value))
                }} />
                <input type="number" value={num2} onChange={function (event) {
                    setNum2(parseInt(event.target.value))
                }} />

                
                <button className="btn btn-success" onClick={function () {
                    setAdd(num1 + num2)
                }}>+</button>
                <h1>{add}</h1>
            </div>
        </div>
    );
}