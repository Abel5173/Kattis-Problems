import sys
from typing import Counter

l = sys.stdin.readlines()
n = int(l[0])
del(l[0])
d = Counter(l[:n])
k = Counter(l[n:])

a = d-k
b = d-a
print(sum(b.values()))
