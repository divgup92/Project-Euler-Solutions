package utils;

import java.util.*;

public class Prime {

    public static boolean isPrime(long n) {
        if (n <= 1L)
            return false;
        if (n == 2L || n == 3L)
            return true;
        if (n % 2L == 0L || n % 3L == 0L)
            return false;
        for (long i = 5L; i * i <= n; i += 6L) {
            if (n % i == 0L || n % (i + 2L) == 0L) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long n, List<Long> primesLessThanN) {
        for (Long prime : primesLessThanN) {
            if (n % prime == 0)
                return false;
        }
        return true;
    }

    public static List<Long> getPrimesLessThanN(long n) {
        List<Long> primes = new ArrayList<>();
        if (n <= 1L)
            return primes;
        primes.add(2L);
        primes.add(3L);
        for (long i = 5L; i <= n; i += 6L) {
            if (isPrime(i, primes))
                primes.add(i);
            if (i + 2L > n)
                break;
            if (isPrime(i + 2L, primes))
                primes.add(i + 2L);
        }
        return primes;
    }

    public static List<Integer> getPrimefactorisation(int n) {
        int num = n;
        List<Integer> factors = new LinkedList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        while (n % 3 == 0) {
            factors.add(3);
            n /= 3;
        }
        for (int i = 6; i - 1 <= num; i += 6) {
            while (n % (i - 1) == 0 && isPrime(i - 1)) {
                factors.add(i - 1);
                n /= (i - 1);
            }
            while (n % (i + 1) == 0 && isPrime(i + 1)) {
                factors.add(i + 1);
                n /= (i + 1);
            }
        }
        return factors;
    }

    public static Map<Long, Long> getPrimefactorMap(Long n) {
        Map<Long, Long> fMap = new HashMap<>();
        long num = n;
        while (n % 2 == 0) {
            long value = fMap.get(2l) != null ? fMap.get(2l) + 1 : 1l;
            fMap.put(2l, value);
            n /= 2;
        }
        while (n % 3 == 0) {
            long value = fMap.get(3l) != null ? fMap.get(3l) + 1 : 1l;
            fMap.put(3l, value);
            n /= 3;
        }
        for (long i = 6; i - 1 <= num; i += 6) {
            if (n % (i - 1) == 0 && isPrime(i - 1)) {
                while (n % (i - 1) == 0) {
                    long value = fMap.get(i - 1) != null ? fMap.get(i - 1) + 1 : 1l;
                    fMap.put(i - 1, value);
                    n /= (i - 1);
                }
            }
            if (n % (i + 1) == 0 && isPrime(i + 1)) {
                while (n % (i + 1) == 0) {
                    long value = fMap.get(i + 1) != null ? fMap.get(i + 1) + 1 : 1l;
                    fMap.put(i + 1, value);
                    n /= (i + 1);
                }
            }
        }
        return fMap;
    }

    public static long getNthPrime(int n) {
        int count = 2;
        long val = 0;
        switch (n) {
            case 1:
                val = 2l;
            case 2:
                val = 3l;
            default:
                for (long i = 6; count < n; i += 6) {
                    if (isPrime(i - 1))
                        count++;
                    if (count == n)
                        val = i - 1;
                    if (isPrime(i + 1))
                        count++;
                    if (count == n)
                        val = i + 1;
                }
        }
        return val;
    }

    public static List<Long> getPrimesLessThanNSeive(long n) {
        List<Long> primes = new ArrayList<>();
        for (long i = 2; i < n; i++)
            primes.add(i);
        int pointer = 0;
        while (pointer < primes.size()) {
            long a = primes.get(pointer);
            for (long j = 2 * a; j < n; j += a)
                primes.remove(j);
            pointer++;
        }
        return primes;
    }
}
