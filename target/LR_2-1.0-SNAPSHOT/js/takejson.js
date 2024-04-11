"use strict";

let Users = {};
function req(){
    Users.name = document.getElementById("Name").value;
    Users.lastname = document.getElementById("LN").value;
    Users.middlename = document.getElementById("MN").value;
    Users.age = document.getElementById("Age").value;
    Users.language = document.getElementById("Lng").value;

    let mydata = JSON.stringify(Users);

    $.ajax({
        type: 'POST',
        url: "http://localhost:8080/LR_2_war_exploded/AddServlet?data=" + encodeURIComponent(mydata),
        data: mydata,
        dataType: "json",
        contentType: "application/json"
    });
}


