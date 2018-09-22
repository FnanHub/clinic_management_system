$(function(){

    $('.doctors_list').click(getDoctors);


    function processList(data) {
        console.log("list of doctors replayed");

    }

    function getDoctors(){

        alert("button clicked" + this.value);
        const doctorsList = this.value();
        $.post('doctors', doctorsList, processList, "json")
    }
})