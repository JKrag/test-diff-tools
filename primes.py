def primes(n):
    """
    Compute the sequence of the first n primes.
    primes(n) -> [2, 3, 5, ..., Pn]
    where Pn is the nth prime number.
    """
    p = []
    if n > 0:
        p = [2, ]
        for x in range(1, n):
            q = p[-1] + 1
            while True:
                for y in p:
                    if not (q % y):
                        break
                else:
                    p.append(q)
                    break
                q += 1
    return p


# Snippet from https://github.com/cbcunc/primer/blob/master/primer/primer.py
