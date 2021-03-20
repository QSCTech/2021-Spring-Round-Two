# 黄金矿工 (Gold Miner)



## 任务背景

![gold_miner_pic](https://uploader.shimo.im/f/Mj8yru7ca13ZbKYL.jpeg!thumbnail) 

Baby Switch 闲的没事就喜欢逛b站。

有一天，他赫然发现首页上出现了一位[ UP 主](https://space.bilibili.com/383620777/)在坚持不懈地更新黄金矿工，甚至现在已经更新到 4w 关了……

他大受震撼，于是准备打开 4399 来一局精彩刺激的黄金矿工，结果……

 ![error_please_download_360_or_sogou](https://uploader.shimo.im/f/mZD4AmbXlgZtpVjO.png!thumbnail) 造成 Baby Switch 不能使用他最心爱的浏览器游玩黄金矿工的原因，是：[https://docs.microsoft.com/en-us/lifecycle/announcements/update-adobe-flash-support ](https://docs.microsoft.com/en-us/lifecycle/announcements/update-adobe-flash-support)

扯远了，让我们回到正题。

Baby Switch 并不想下载以上两个浏览器中的任意一个，但他又特别想玩黄金矿工……他听说人们现在都在用 H5 写网页游戏，于是他去便去找 Switch 求助。Switch 当然希望满足 Baby Switch 的愿望，但是他又懒得自己动手，于是他反手将任务布置给了你们（真是个带恶人），希望你们能实现 Baby Switch 玩到黄金矿工的心愿。 

## 任务描述

请你利用 HTML/CSS/Javascript 写一款自定义的黄金矿工游戏。

黄金矿工游戏本身相信大家都已经玩过了，我们在这里按照 Baby Switch 的独特爱好做一些约定：

1. Baby Switch 很怀念在 4399 玩游戏的感觉，因此游戏界面的长宽比请设置为 4:3， 并且他希望游戏界面可以铺满整个窗口 （并且随着窗口大小的变化而等比例变化，你可以参考：[ https://developer.mozilla.org/en-US/docs/Learn/CSS/CSS_layout/Responsive_Design](https://developer.mozilla.org/en-US/docs/Learn/CSS/CSS_layout/Responsive_Design)）

2. 或许黄金矿工并不一定要抓黄金……他可以抓钻石、猪和炸药桶……当然你也可以让他抓番茄、史莱姆甚至末影龙（？）
   总之，希望你能设计**不少于5种**不同的元素（外观不一定完全不同，比如大金块和小金块可以算2种），让 Baby Switch 不至于觉得太无聊。每一种元素都应该有其独特的价格、大小、重量。哦 另外，Baby Switch 希望里面**至少有一种**会动的东西！另外，为了让 Baby Switch 玩着更刺激，我们希望**至少有一种**元素的价值（或者包括重量）是随机的。

3. 我们可以把游戏界面分成两部分，最上面1/5的地方，放置我们的矿工（矿工的样子你当然也可以自定义……或许你会希望摆一个你自己喜欢的动漫角色（？））在关卡开始的时候，将要抓的东西，随机地（或者也可以人为指定？）分布在地层的下面。
   游戏的操作大家也十分熟悉，就是有一个钩子在上面来回摇摆，然后按下键盘上的↓方向键就可以将钩子释放。事实上，原本的黄金矿工中有“丢炸弹”这一操作，但是为了不让 Baby Switch 产生搞破坏的欲望，你可以先不实现这个功能。当然，商店也可以不实现

4. 玩游戏嘛，当然要有计分，因此，我们希望在游戏界面的左上角，可以显示当前已经抓到的东西的总价值；以及，要达到的目标分。我们**强烈**建议目标分的设置不要超过所有东西价值的总和，以防 Baby Switch 发现无论如何都无法通关而气急败坏。

5. 时间也是游戏中很重要的一环，在游戏的右上角，需要跟经典的黄金矿工一样，有倒数计时的功能，时间的长度可以根据你设计的关卡难度而定。当然，每一个元素都有自己的判定区域…… 在这里，我们希望判定区域的大小和素材的大小差不多大，至于是圆形还是正方形，可以由你自己决定（当然你要是想让判定区域是个心形也不是不行XD

6. 那么怎么判定此关成功或不成功呢？当总价值超过目标分的时候就应判定为成功，而当倒数计时完毕，但仍旧没有成功，就应判定为失败。

7. 由于 Baby Switch ~~比较好糊弄~~，你只需要设计一道黄金矿工关卡就好了。在满足以上条件后，如果你想多加一些新的 Feature ， Baby Switch 会非常开心！

8. 如果还有哪一点 Baby Switch 的喜好还不太了解，或者对于这个任务的其他一些事宜有疑问的话，欢迎在群里进行提问，或者直接去问 Switch 本人，他会好好地把 Baby Switch 的想法传达出来的~

   

##  温馨提示

1. 为了完成此项任务，你可能需要一个 <canvas>，并使用 JavaScript 来控制图像的绘制。

   - 你可以参考 MDN 上 Canvas API 的相关介绍：https://developer.mozilla.org/zh-CN/docs/Web/API/Canvas_API

   - 如果你对 JavaScript 不够熟悉，你可以参阅 https://zh.javascript.info/ ，这个网站有比较现代的 JavaScript 语法和语言特性的介绍。
2. 如果你真的不知道从何开始，可以参考：https://developer.mozilla.org/en-US/docs/Games/Tutorials/2D_Breakout_game_pure_JavaScript
3. Have fun~