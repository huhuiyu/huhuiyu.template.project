import { ajax } from './ajax.js';

ajax.setBaseUrl('http://127.0.0.1:8080/javaweb');

let preResult = document.getElementById('preResult');

ajax.post('/json.action', {}, (data) => {
  preResult.append(JSON.stringify(data, null, 2));
});
