$(function () {
    'use strict'
    $('.doctors_list').click(getDoctors);

    function make_reservation(doc_id) {
        return function () {
                    alert(" reservation made: " + doc_id);
                };
    }

    function processList(data) {

        data.forEach(doc => {
            console.log("data recieved from Ajax " + doc.email + " " + doc.last_name + " " + doc.first_name + " " + doc.clinicserviceId);
            let selector = doc.clinicserviceId;

            let td_lastname = $('<td >').text(doc.last_name);
            let td_firstname = $('<td>').text(doc.first_name);
            let td_email = $('<td>').text(doc.email);
            let td_reservation = $('<button id=' + doc.id + ' class="btn btn-primary btn-sm btn-default" />').text('Reserve').click(make_reservation(doc.id));
            let tr = $('<tr>').append(td_lastname).append(td_firstname).append(td_email).append(td_reservation);

            $('#doc_table' + selector).css("display", "block");
            $("#doc_body" + selector).append(tr);

        })
    }

    function handleError(data) {
        console.log("ajax call failred")
    }

    function getDoctors() {

        $('.table').css("display", "none");

        let doc_id = this.value;
        // alert("hi pizza " + doc_id);
        let doct = {action: doc_id};

        $.get('clinicalDocCont', {doc: JSON.stringify(doct)}, processList, "json").fail(handleError)

    }
})