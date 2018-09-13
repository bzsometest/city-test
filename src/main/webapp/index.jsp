<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<select id="province"></select>
<select id="city"></select>
<select id="area"></select>
<script src="jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
<script>
    $(function () {
        getProvince();
        $("#province").change(function () {
            var id = $(this).val();
            getCity(id);
        });
        $("#city").change(function () {
            var id = $(this).val();
            getArea(id);
        });
    });

    function getProvince() {
        $.getJSON("region/all", function (data) {
            $("#province").empty();
            $.each(data, function (i, province) {
                var option = $("<option></option>");
                option.val(province.regionId);
                option.text(province.regionName);
                $("#province").append(option);
            });
        });
    }

    function getCity(id) {
        $.getJSON("region/city/" + id, function (data) {
            $("#city").empty();
            $.each(data, function (i, province) {
                var option = $("<option></option>");
                option.val(province.regionId);
                option.text(province.regionName);
                $("#city").append(option);
            });
        });
    }

    function getArea(id) {
        $.getJSON("region/area/" + id, function (data) {
            $("#area").empty();
            $.each(data, function (i, province) {
                var option = $("<option></option>");
                option.val(province.regionId);
                option.text(province.regionName);
                $("#area").append(option);
            });
        });
    }
</script>
</body>
</html>
