package com.snow.appbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;

import com.snow.appbar.databinding.ActivityAppbarCoordiBinding;
import com.snow.common.tool.bar.StatusNavBar;

/**
 * author : snowzhao
 * e-mail : zyt@ttsing.com
 * date   : 2020/4/23
 * desc   :AppbarLayout折叠效果
 */
public class AppBarCoordiActivity extends BaseActivity<ActivityAppbarCoordiBinding> {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_appbar_coordi;
    }

    @Override
    protected void setViewData(Bundle savedInstanceState) {
        StatusNavBar.with(this).statusBarColor(R.color.transparent)
                .statusBarDarkFont(true).navigationBarColor(R.color.black_degree_50).init();

        mBinding.textView.setText(sss);
//设置自定义的返回按钮
//        mBinding.toolbar.setNavigationIcon(getResources().getDrawable(R.mipmap.ic_back));
        //设置默认的返回按钮
        setSupportActionBar(mBinding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mBinding.ctlTitle.setCollapsedTitleGravity(Gravity.LEFT);//设置收缩后标题的位置
        mBinding.ctlTitle.setExpandedTitleGravity(Gravity.BOTTOM);////设置展开后标题的位置
        mBinding.ctlTitle.setTitle("Snowzhao");//设置标题的名字
        mBinding.ctlTitle.setExpandedTitleMarginStart(10);//设置标题展开距离开始的距离
        mBinding.ctlTitle.setExpandedTitleColor(Color.WHITE);//设置展开后标题的颜色
        mBinding.ctlTitle.setCollapsedTitleTextColor(Color.RED);//设置收缩后标题的颜色

    }


    private String sss = "01 “垃圾快乐”容易让人上瘾\n" +
            "\n" +
            " \n" +
            "\n" +
            "所谓的垃圾快乐，就是能带来短暂的精神快感。\n" +
            "\n" +
            " \n" +
            "\n" +
            "比如搞笑的短视频、好玩的综艺、肥皂剧，看着非常过瘾，让人不禁沉浸于“哈哈大笑”的喜欢。\n" +
            "\n" +
            " \n" +
            "\n" +
            "说到“垃圾快乐”，不得不提提我的同事小k。\n" +
            "\n" +
            " \n" +
            "\n" +
            "小k以前的生活是，下班后的时间，就约上几个好朋友吃个饭，看个电影，每天晚上睡前看一会书，基本上两三天就能看完一本书。\n" +
            "\n" +
            " \n" +
            "\n" +
            "早上刚来闲聊那会，她喜欢和我们分享她昨天看的书，侃侃而谈昨日又看到让她颇有感受的观点，眼神都是在发着光。\n" +
            "\n" +
            " \n" +
            "\n" +
            "但近期，小k渐渐变得有些不一样。\n" +
            "\n" +
            " \n" +
            "\n" +
            "不再和大家分享看到的好书好电影。\n" +
            "\n" +
            " \n" +
            "\n" +
            "上班经常迟到，赶到办公室的时候满头大汗，气喘吁吁，整个人已经没有了以前的好气色和精力。\n" +
            "\n" +
            " \n" +
            "\n" +
            "取而代之的是，眼睛下挥之不去的乌青，散乱的头发，昏昏欲睡的状态。\n" +
            "\n" +
            " \n" +
            "\n" +
            "小k最近迷恋上一款小游戏，原本只想玩玩打发时间，却没想到开始了就停不下来。\n" +
            "\n" +
            " \n" +
            "\n" +
            "玩到通宵，第二天睡得起不来，迟到了大半天……午休时间，吃饭的等餐时间，都在玩，甚至为这个游戏充了不少钱买了一堆没什么用的皮肤。\n" +
            "\n" +
            " \n" +
            "\n" +
            "我们劝过小k，别太沉迷于游戏中，她总是笑笑不以为然地说：“生活这么苦，总要找点乐子，缓解下压力。”\n" +
            "\n" +
            " \n" +
            "\n" +
            "直到昨天，小k又一次迟到，连续的迟到让主管气到扣了她这个季度的奖金。她才意识到，自己的生活已经被这所谓的“乐子”搞得一团糟。\n" +
            "\n" +
            " \n" +
            "\n" +
            "之前看到过一篇文章，说到：垃圾快乐成瘾，比毒品成瘾更可怕。\n" +
            "\n" +
            " \n" +
            "\n" +
            "毒品成瘾，每个人都知道是件必须拒绝和远离的事。\n" +
            "\n" +
            " \n" +
            "\n" +
            "而垃圾快乐，一旦尝到了甜头，就会忍不住地想要更多，让你的意志迷失，忽略到本来应该做的事情。\n" +
            "\n" +
            " \n" +
            "\n" +
            "它默不作声地，让你慢慢成瘾，一层“快乐”的糖衣之下，也许会有刹那甜蜜的错觉，但久而久之，你就会尝到它带来的苦。";
}
