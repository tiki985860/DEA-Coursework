function toggleUser(){
    document.getElementById("staff-toggle").style.backgroundColor="#fff";
     document.getElementById("staff-toggle").style.color="#222";
     document.getElementById("user-toggle").style.backgroundColor="#04026c";
     document.getElementById("user-toggle").style.color="#fff";
     document.getElementById("staff-form").style.display="none";
     document.getElementById("user-form").style.display="block";
 }
 
 function toggleStaff(){
     document.getElementById("staff-toggle").style.backgroundColor="#04026c";
     document.getElementById("staff-toggle").style.color="#fff";
     document.getElementById("user-toggle").style.backgroundColor="#fff";
     document.getElementById("user-toggle").style.color="#222";
     document.getElementById("user-form").style.display="none";
     document.getElementById("staff-form").style.display="block";
     }
     

