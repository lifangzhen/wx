<!DOCTYPE html>
<html lang="en-US">
<head>
    <meta charset="UTF-8">
    <title>抽奖</title>
    <style type="text/css">
        ul{list-style:none;}
        li{display:inline-block; border:1px solid #000;}
        span{display:inline-block; padding:10px 15px;}
        li .lottery_yeah{background:red;}
    </style>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.8.1.min.js"></script>
</head>
<body>
<input type="button" id="btn" value="抽我抽我" />
<ul id="la" class="lottery_all">
    <#list list as item>
        <li><span eid="${item.id}" class="lottery_box">${item.name}</span></li>
    </#list>
</ul>
<div id="zj">
    <h2>中奖人:</h2>
</div>
<script type="text/javascript">
    /*
* 抽奖封装对象
* @class LuckyDraw
* @param { Number } 抽奖悬停号码
* @method LuckyDraw.tigerMac
* @param { Number, Function } 运动步伐间距，回调函数
*
*/
    function LuckyDraw( numId ) {
        if ( this instanceof LuckyDraw ) {
            this.rewardId = numId;
            this.timer = null;
        } else {
            return new LuckyDraw( numId );
        }
    }

    LuckyDraw.prototype.tigerMac = function( iStep, callback ) {
        var speed = 200 / iStep, // 时间间隔
                $luckyItem = $('#la .lottery_box'),
                len = $luckyItem.length,
                index = 0, // 索引值
                _this = this;

        $luckyItem.removeClass('lottery_yeah').eq( index ).addClass('lottery_yeah');

        this.timer = setInterval(function () {
            if ( index + 1 > len ) {
                index = 0;
                iStep++;
                clearInterval( _this.timer );
                _this.tigerMac( iStep, callback );
            } else {
                if ( iStep >= 6 ) {
                    if ( _this.rewardId && $luckyItem.eq( index ).attr('eid') == _this.rewardId ) {
                        $luckyItem.eq( index ).addClass('lottery_yeah');
                        clearInterval( _this.timer );
                        if ( callback && typeof callback === 'function' ) {
                            callback.call( $luckyItem[index] );
                        }
                        return
                    }
                }
                index++;
            }
            $luckyItem.removeClass('lottery_yeah').eq(index).addClass('lottery_yeah');
        }, speed)
    };

    var first = 2;
    var second = Math.ceil(Math.random() * 10);
    var third = Math.ceil(Math.random() * 10);

    // 抽奖
    $('#btn').click(
            (function(){
                var n = 3,
                        aLuckyNum = [first, second, third],
                        oCj = null;

                return function() {
                    if ( n ) {
                        oCj = new LuckyDraw( aLuckyNum[n - 1] );
                        n--;
                        oCj.tigerMac( 1, function(){
                            $("#zj").append('<h1 style="background-color: grey">'+$(this).text()+'</h1>');
//                            if ( Number( $(this).text() ) === 6 ) {
//                                alert('恭喜中奖啦！你还有' + n + '次抽奖机会哦！');
//                            } else if ( n ) {
//                                alert('^ @ ^ 没中奖，加油！你还有' + n + '次抽奖机会哦！');
//                            } else {
//                                alert('^ @ ^ 没中奖！谢谢参与');
//                            }
                        } );
                        oCj = null;
                    }else {
                        alert('只有三个奖项');
                    }
                }
            })()
    );
</script>
</body>
</html>