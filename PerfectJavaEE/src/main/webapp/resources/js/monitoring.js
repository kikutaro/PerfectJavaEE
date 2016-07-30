function monitoring(data) {
    switch (data.status) {
        case "begin":
            window.alert('begin');
            break;
        case "complete":
            window.alert('complete');
            break;
        case "success":
            window.alert('success');
            break;
    }
    
    window.alert('status :' + data.status + '\n' +
        'type :' + data.type + '\n' +
        'source :' + data.source + '\n' +
        'responseXML :' + data.resuponseXML + '\n' +
        'responseText :' + data.responseText + '\n' +
        'responseCode :' + data.responseCode + '\n');
}