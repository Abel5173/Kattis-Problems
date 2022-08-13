x, y = map(int, input().split())
q = x
s = []
pos = 0
neg = 0
while x:
    a, b, c = map(int, input().split())

    s.append(a)
    s.append(b)
    s.append(c)
    x -= 1

for n in s:
    if n > 0:
        pos += 1
    else:
        neg += 1
# o=[]
# cnt=0
# for m in range(3):
#     o.append(cnt)
#     cnt=1
#     for n in range(m,9,3):
#         a=s[n]
#         if a==s[n]:
#             cnt+=1
# o=sorted(o)
# print(o[2])
o = []
cnt = 0
for i in range(-y-1, y+2):
    o.append(cnt)
    cnt = 0
    for j in s:
        if i == j:
            cnt += 1

o = sorted(o)
w = o[y]

sat = neg+pos
if (q >= 8 and w <= q//2):
    print("satisfactory")
else:
    print("unsatisfactory")

    # sat%2==0 and
