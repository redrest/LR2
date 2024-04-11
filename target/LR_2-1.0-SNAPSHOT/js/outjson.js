"use strict";

let str = "";
function output()
{
    var client = new XMLHttpRequest();

    client.onreadystatechange = function ()
    {
        if (client.readyState === 4 && client.status === 200)
        {
            str = JSON.parse(client.responseText);
            gggg(str);
        }
    };
    client.open("POST", "http://localhost:8080/LR_2_war_exploded/OutServlet?", true);
    client.setRequestHeader("Content-type", "application/json");
    client.send("");
}

function gggg(str) {
    let out = document.getElementById("tablica");

    out.innerHTML = `
        <h1>Users list</h1>
        <table class="table table-striped">
            <thead class="thead-dark">
                <tr>
                    <th>Last name</th>
                    <th>Name</th>
                    <th>Middle name</th>
                    <th>Age</th>
                    <th>Language</th>
                </tr>
            </thead>
            <tbody>
    `;

    for (let i = 0; i < str.length; i++) {
        let user = str[i];
        out.innerHTML += `
            <tr>
                <td>${user.lastname}</td>
                <td>${user.name}</td>
                <td>${user.middlename}</td>
                <td>${user.age}</td>
                <td>${user.language}</td>
            </tr><br>
        `;
    }

    out.innerHTML += `
            </tbody>
        </table>
    `;
}