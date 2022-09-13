p, n = map(int, input().split())
s = set()
b = True
c = int()
for i in range(1,n+1):
    a = input()
    s.add(a)
    if(len(s) == p and b):
        c = i
        b = False
if b:
    print('paradox avoided')
else:
    print(c)