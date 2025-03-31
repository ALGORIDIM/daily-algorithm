first, second=map(int, input().split())

rev_f = int(str(first)[::-1])
rev_s = int(str(second)[::-1])

if rev_f > rev_s:
    print(rev_f)
else:
    print(rev_s)
