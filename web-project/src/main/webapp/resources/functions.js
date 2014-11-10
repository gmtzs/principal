$(document).ready(function(){
	
	$("#submit").click(function(){
		$.blockUI();
		var user = $("#userName").val();
		var pwd  = $("#pwd").val();
		if (!user || !pwd){
			$.unblockUI();
			return true;
		}
	});
		
	});