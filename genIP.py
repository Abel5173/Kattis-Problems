from itertools import permutations
class Solution:
    def genIp(self, s):
        a = [*s]
        l = list(permutations(a))
        lst = []
        for i in l:
            lst.append('.'.join(i))
        return lst


#{ 
 # Driver Code Starts
#Main
if __name__=='__main__':
    t = int(input())
    for i in range(t):
        s = input().strip()
        res = Solution().genIp(s)
        res.sort()
        if(len(res)):
            for u in res:
                print(u)
        else:
            print(-1)