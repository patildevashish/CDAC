export function Header(props) {
    // console.log(props);
    // props.show();
    return(
        <div>
            <div className="alert alert-success">
                <strong>This is Header <br/> {"Name = "+props.person.name}&nbsp;&nbsp;&nbsp;{"Age = "+props.person.age}</strong>
                {/* <strong>Names: - {props.names[0]}-{props.names[1]}-{props.names[2]}</strong><br/> */}
                <h1>Names</h1>
                <ul>
                    {props.names.map(function (p) 
                    { 
                        return(
                            <li>{p.name}-{p.Age}-{p.Mobile}</li>
                        )
                    }
                    )}
                </ul>
                <br/>
                <button onClick={props.showDetails}>Show</button>
            </div>
        </div>
    );
}