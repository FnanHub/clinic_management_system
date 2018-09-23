$(function(){
    'use strict'


    $(".admin").click(getList);

    function getList() {
        // alert( this.value + " is clicked")
        const act = this.value;
        const doc = 'doctors';
        const ser = 'services';

        if(act === doc){
            $.get("admin_home", act, process_doc_list, "json")

        }else if (act === ser) {
            $.get("admin_home", act, process_ser_list, "json")
        }

    }


    function process_ser_list(data) {

    }

    function process_doc_list(data) {
        $('#tbl_list').css("display", "block");
        data.forEach(docs => {
            console.log("data recieved from Ajax " + docs.first_name);

            let td_id = $('<td>').text(docs.id);
            let td_firstName = $('<td>').text(docs.first_name);
            let td_LastName = $('<td>').text(docs.last_name);
            let td_Email = $('<td>').text(docs.email);
            let td_phone = $('<td>').text(docs.phone_number);
            let td_delete = $('<button id=' + docs.id +'/>').text('Delete').click(function () { alert('hi ' + docs.id); });
            let tr = $('<tr>').append(td_id).append(td_firstName).append(td_LastName).append(td_Email).append(td_phone).append(td_delete);

            $('#data_list').append(tr);
        })
    }

})