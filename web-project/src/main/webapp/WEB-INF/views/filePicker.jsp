<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Google Drive File Picker Example</title>
</head>
<body>
	<button type="button" id="pick">Pick File</button>
	
	<script src="resources/filePicker.js"></script>
	<script>
		function initPicker() {
			var picker = new FilePicker({
				apiKey: 'AIzaSyAg1p6JfVwzjdl0wgSYvG5MrMOz6dsT1JQ',
				clientId: '626156534330-ehfqv69dh13md17ndk77hia04or1sn8n.apps.googleusercontent.com',
				buttonEl: document.getElementById('pick'),
				onSelect: function(file) {
					console.log(file);
					alert('Selected ' + file.title);
				}
			});	
		}
	</script>
	
	<script src="https://www.google.com/jsapi?key=AIzaSyANQN5X7tXI0b76aBs6wUBFgf-gboJrpbk"></script>
	<script src="https://apis.google.com/js/client.js?onload=initPicker"></script>
</body>
</html>