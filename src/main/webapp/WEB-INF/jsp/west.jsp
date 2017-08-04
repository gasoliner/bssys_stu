<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2016/12/26
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<style type="text/css">
    .menu-last {
        margin-bottom: 5px;
    }
</style>
<body>
<div class="easyui-accordion" style="width:auto;border: 0px;">
    <ul id="menu" class="easyui-tree" style="margin-top: 10px;margin-left: 5px;">
        <li>
            <span>课题管理</span>
            <ul>
                <li data-options="attributes:{'url':'tp_1_manage'}">选课题</li>
                <li data-options="attributes:{'url':'tp_1_manage'}">我的课题</li>
            </ul>
        </li>
        <li>
            <span>个人相关操作</span>
            <ul>
                <li>
                    <span>个人信息管理</span>
                    <ul>
                        <li data-options="attributes:{'url':'personalInfo'}">个人信息</li>
                        <li data-options="attributes:{'url':'personalPass'}">密码修改</li>
                    </ul>
                </li>
                <li>
                    <span>邮件管理</span>
                    <ul>
                        <li data-options="attributes:{'url':'per_mail_message'}">向老师提问</li>
                        <li data-options="attributes:{'url':''}">收件箱</li>
                        <li data-options="attributes:{'url':''}">发件箱</li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
</div>

<script type="text/javascript">
    $(function(){
        $('#menu').tree({
            onClick: function(node){
                if($('#menu').tree("isLeaf",node.target)){
                    if ($('#tt').tabs('exists', node.text)){
                        $('#tt').tabs('select', node.text);
                    } else {
                        var content = '<iframe scrolling="auto" frameborder="0"  src="'+node.attributes.url+'" style="width:100%;height:100%;"></iframe>';
                        $('#tt').tabs('add',{
                            title:node.text,
                            content:content,
                            closable:true
                        });
                    }
                }
            }
        });
    });
</script>
</body>
