$(function(){
	
	
	$("#test_button").click(function(){
		var url = path+'/getclient/jian';
		$.get({
			url:url,
			data:{"a":1},
			success:function(result){
				
			}
		
		});
	});
	
});