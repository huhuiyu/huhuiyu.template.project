import { ajax } from './ajax.js';

ajax.setBaseUrl('http://127.0.0.1:10100');

let txtDeptname = document.getElementById('txtDeptname');
let btnQuery = document.getElementById('btnQuery');
let preResult = document.getElementById('preResult');

btnQuery.addEventListener('click', () => {
  ajax.post(
    '/dept/queryAll',
    {
      deptName: txtDeptname.value,
    },
    (data) => {
      preResult.innerHTML=(JSON.stringify(data, null, 2));
    }
  );
});
