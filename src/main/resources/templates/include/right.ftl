<div class="layui-col-md4">
    <dl class="fly-panel fly-list-one">
        <dt class="fly-panel-title">今日热卖</dt>
        <@hots>
            <#list results as goods>
                <dd>
                    <a href="jie/detail.html">${goods.name}</a>
                    <span><i class="iconfont icon-pinglun1"></i>${goods.num}</span>
                </dd>
            </#list>
        </@hots>
    </dl>

</div>
