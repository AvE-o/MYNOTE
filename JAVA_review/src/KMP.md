KMP 应用在字符串匹配上
NEXT 为前缀表 会记录下已经匹配的字符串 [在文本串中找模式串]
--首先要知道"前缀表"的任务是当前位置匹配失败，找到之前已经匹配上的位置
--再重新匹配，此也意味着在某个字符失配时，前缀表会告诉你下一步匹配中，模式串应该跳到哪个位置。


例*：
文本串：aabaabaaf

字符串：aabaaf
       010120


前缀：包含首字母不包含尾字母 [不包含最后一个f]
后缀：只包含尾字母不包含首字母 [不包含第一个a]

求最长相等前后缀
    a           0
    aa          1
    aab         0
    aaba        1
    aabaa       2
    aabaaf      0

next/prefix:
我们这里用next -> 利用右移和-1都可以实现KMP算法工作

具体实现:

pseudocode:
    // i -> 后缀末尾位置 j -> 前缀末尾
    getNext(next, s){
        //初始化
        //处理前后缀不相同情况
        //处理前后缀相同情况
        //next
        j = 0;
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            while (s[i] != s[j] && j > 0) {
                回退到前一位对应数组的值;
            }
            if (s[i] == s[j]) {
                j++;
            }
            next[i] = j;
        }
    
        
    }


