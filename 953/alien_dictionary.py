class Solution:
    def compareWords(self, word1, word2, d):
        for i in range(max(map(len, [word1, word2]))):
            l = list(zip(word1, word2))
            b = True
            for h in l:
                if d[h[0]] > d[h[1]]:
                    return False
                elif d[h[0]] < d[h[1]]:
                    return True
            if len(word2) >= len(word1):
                return True
            else:
                return False
            
    def isAlienSorted(self, words, order):
        """
        :type words: List[str]
        :type order: str
        :rtype: bool
        """
        d = {}
        for i in range(len(order)):
            d[order[i]] = i
        
        for i in range(len(words) - 1):
            if not self.compareWords(words[i], words[i+1], d):
                return False
                
        return True

