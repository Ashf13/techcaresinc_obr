$(function() {
    $('#select_hospital').change(function(){
        $('.select_hospital').hide();
        var select_hospital = $(this).val();

        switch (select_hospital) {
            case "hospital":
                $('#' + select_hospital).show();
                document.getElementById("newborncertificate").setAttribute("action", "/new");
                break;

            case "null_hospital":
                $('#' + select_hospital).show();
                document.getElementById("newborncertificate").setAttribute("action", "/see");
                break;
        }
    });
});
