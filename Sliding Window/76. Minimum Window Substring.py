from collections import Counter

class Solution:
    def minWindow(self, s: str, t: str) -> str:

        need = Counter(t)
        have = {}

        freq = len(need)

        i = 0
        start = 0
        minLen = float('inf')

        for j in range(len(s)):

            if s[j] in need:
                have[s[j]] = have.get(s[j], 0) + 1

                if have[s[j]] == need[s[j]]:
                    freq -= 1

            while freq == 0:

                if j - i + 1 < minLen:
                    minLen = j - i + 1
                    start = i

                if s[i] in need:
                    have[s[i]] -= 1

                    if have[s[i]] < need[s[i]]:
                        freq += 1

                i += 1

        if minLen == float('inf'):
            return ""

        return s[start:start + minLen]