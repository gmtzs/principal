$(document).ready(function(){
	
	function test() { 
        $.ajax({ 
        	type: 'POST', 
        	url: 'Sign.htm', 
        	cache: false }); 
    }
	
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