n = int(input())
cnt = 0
for i in range(n):
    s = input()
    a = s.lower()
    if a.find('pink') != -1 or a.find('rose') != -1:
        cnt += 1
if cnt == 0:
    print('I must watch Star Wars with my daughter')
else:
    print(cnt)
