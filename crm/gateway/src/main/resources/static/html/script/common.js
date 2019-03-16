function reload() {
    window.location.reload();
}

function help(msg) {
    alert('欢迎使用，' + msg);
}

function to(url) {
    window.location.href = url;
}

function back() {
    history.go(-1);
}

function save(url) {
    alert('保存成功！');
    to(url);
}

function add(url) {
    alert('新建成功！');
    to(url);
}

function del(msg) {
    if (window.confirm("确认删除" + msg + "？")) {
        reload();
    }
}

function setCurTime(oid) {
    var now = new Date();
    var year = now.getFullYear();
    var month = now.getMonth() + 1;
    var day = now.getDate();
    var hours = now.getHours();
    var minutes = now.getMinutes();
    var seconds = now.getSeconds();
    var timeString = year + "-" + add0(month) + "-" + add0(day) + " " + add0(hours) + ":" + add0(minutes) + ":" + add0(seconds);
    var oCtl = document.getElementById(oid);
    oCtl.value = timeString;
}

function toUrl(id, url) {
    localStorage.setItem("id", id);
    to(url);
}

function add0(m) {
    return m < 10 ? '0' + m : m
}

function formatDate(time, type) {
    var d = new Date(time);
    var year = d.getFullYear();
    var month = d.getMonth() + 1;
    var date = d.getDate();
    var hour = d.getHours();
    var minute = d.getMinutes();
    var second = d.getSeconds();
    if (type == "1") {
        return year + "-" + add0(month) + "-" + add0(date);
    } else {
        return year + "-" + add0(month) + "-" + add0(date) + " " + add0(hour) + ":" + add0(minute) + ":" + add0(second);
    }
}