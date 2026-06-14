function searchStudent(){

    let id = document.getElementById("studentId").value;

    if(id === ""){
        alert("Please Enter Student ID");
        return;
    }

    let students = {
        1:{
            id:1,
            name:"Anisha",
            age:22,
            course:"BTech"
        },

        2:{
            id:2,
            name:"Tanu",
            age:22,
            course:"BBA"
        },

        3:{
            id:3,
            name:"Shivi",
            age:22,
            course:"BBA"
        },

        4:{
            id:4,
            name:"Ashi",
            age:21,
            course:"BTech"
        }
    };

    let student = students[id];

    if(student){

        document.getElementById("id").innerText = student.id;
        document.getElementById("name").innerText = student.name;
        document.getElementById("age").innerText = student.age;
        document.getElementById("course").innerText = student.course;

    }else{

        alert("Student Not Found");

document.getElementById('result').style.display = 'block';
// aur initials ke liye:
const initials = name.split(' ').map(n=>n[0]).join('').slice(0,2).toUpperCase();
document.getElementById('avatarInitials').textContent = initials;
    }
}