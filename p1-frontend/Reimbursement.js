const url = "http://localhost:8090/";

window.onload=function(){
document.getElementById("loginButton").addEventListener("click", loginfunc);
}
window.onload=function(){
document.getElementById("GRButton").addEventListener("click", allreimbfunc);}

async function allreimbfunc(){
    
    let response = await fetch(url + "allreimbursements", {credentials : "include"});

    console.log(response);

    if(response.status == 200){

        sessionStorage.getItem(response);

        let data = await response.json();

        for (let reimbursement of data){

            let row = document.createElement("tr");

            let cell1 = document.createElement("td");
            cell1.innerHTML = reimbursement.reimb_id;
            row.appendChild(cell1);

            let cell2 = document.createElement("td");
            cell2.innerHTML = reimbursement.reimb_description;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = reimbursement.reimb_amount;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = reimbursement.reimb_author;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = reimbursement.reimb_type;
            row.appendChild(cell5);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.reimb_status;
            row.appendChild(cell6);

            document.getElementById("reimbursementBody").appendChild(row);
        }

    }

}

async function loginfunc(){

    let usern = document.getElementById("ers_username").value;
    let userp = document.getElementById("ers_password").value;

    let user = {
        ers_username:usern,
        ers_password:userp
    }

    let response = await fetch(url + "login", {

            method: "POST",
            body: JSON.stringify(user),
            credentials: "include"
    });

    sessionStorage.setItem(response);
}
