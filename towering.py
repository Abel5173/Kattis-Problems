from itertools import combinations
import re


l = [int(x) for x in input().split()]
a = l[-2]
b = l[-1]
l = l[:-2]
# a, b = max(a, b), min(a, b)
x = filter(lambda x: sum(x) == a, combinations(l, 3))
y = filter(lambda x: sum(x) == b, combinations(l, 3))
x = sorted(list(next(x)), reverse=True)
y = sorted(list(next(y)), reverse=True)
z = x+y
print(*z)
