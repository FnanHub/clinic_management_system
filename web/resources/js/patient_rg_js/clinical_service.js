$(function(){

    $('.doctors_list').click(getDoctors);


    function processList(data) {
        // data = JSON.parse(data);
        console.log("list of doctors replayed");

        let td0=$('<td>').text(data.first_name);
        let td1 = $('<td>').text(data.last_name);
        let td2 = $('<td>').text(data.email);
        let tr = $('<tr>').append(td0).append(td1).append(td2);

        console.log(data.first_name);
        $('#doc').append(tr);

    }

    function handleError(data) {
        console.log("ajax call failred")
    }

    function getDoctors(){
        // alert("button clicked" + this.value);
        const serviceId = this.value;
        // $.get('doctors_list', serviceId, processList);

        $.get('doctors_list',{doc: JSON.stringify(serviceId)}, processList, "json")

        // $.ajax("doctors_list", {
        //     "type": "GET",
        //     "data": {
        //         "serviceId": serviceId
        //     }
        // }) .done(processList)
        //     .fail(handleError);
    }
})