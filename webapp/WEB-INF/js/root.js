/**
 * 
 */


$(".name").click(function() {
	let input_box = $(".input_box").val();
	$.ajax({
		url: "getUserName",
		type: "post",
		data: { "name": input_box },
		success: function(data) {
			console.log(data);
			$(".result_container").html(data);
		}
	});
});

$(".age").click(function() {
	let input_box = $(".input_box").val();
	$.ajax({
		url: "getUserAge",
		type: "post",
		data: { "age": input_box  },
		success: function(data) {
			console.log(data);
			$(".result_container").html(data);
		}
	});
});

$(".gender").click(function() {
	let input_box = $(".input_box").val();
	$.ajax({
		url: "getUserGender",
		type: "post",
		data: { "gender": input_box },
		success: function(data) {
			console.log(data);
			$(".result_container").html(data);
		}
	});
});

$(".all").click(function() {
	let input_box = $(".input_box").val();
	$.ajax({
		url: "getUserAll",
		type: "get",
		data: { "all": input_box },
		success: function(data) {
			console.log(data.result);
			let str = "<div>이름 : "+data.result.userName+", 나이 : "+data.result.age+", 성별 : "+data.result.gender+"</div>"
			$(".result_container").html(str);
		}
	});
});