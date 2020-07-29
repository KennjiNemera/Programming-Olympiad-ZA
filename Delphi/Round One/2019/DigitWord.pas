Program DigitWord;
{ SACO 2019 Qu3.  Finding a 'needle' in a 'haystack'
  Solution Donald Cook
	Inspired by Boyer-Moore string search (an intuitive, naive algorithm that uses pos() to shorten the search)
}
{ List of words to find:
 'ONE','TWO','THREE','FOUR','FIVE','SIX','SEVEN','EIGHT','NINE' }

{ Qu3. Find words in:
    a)  TWOSEVENFIVE
    b)  TELECOMMUNICATIONS
    c)  ZUEXNIMTDJFDJIHSBDRSJDENNBXCSE
    d)  XEULVFMAATXXZOIFRZCMUQSGHAVXCJUJHXAXOPVZJTD
    e)  ZLXQMVBEHHEPTJDNIBCREPLLGUSJCPXANBJIQYJYJPCYGAVWBPNYGE
}
Var
  haystack, needle, foundsofar, inputString: String;
  i, j, n, m: Integer;
  isFound: Boolean;
  words: Array [1..9] Of String = ('ONE','TWO','THREE','FOUR','FIVE','SIX','SEVEN','EIGHT','NINE');
Begin
  j := 1;
  Readln(inputString);
  While (Not isFound) And (J<=9) Do
    Begin
      {setup for sweep of 'haystack' looking for jth needletern in array words}
      foundsofar := '';          // empty foundsofar
      needle := WORDS[j];        // next 'needle' in the array words
      haystack := inputString;   // restart at the beginning of the haystack

//  Writeln('start foundsofar: ', foundsofar, '  needle: ', needle, '  haystack: ', haystack ); { trace print  }
      For i := 1 To Length(needle) Do
        Begin
          n := Pos(needle[i], haystack);
          If ( needle[i] = haystack[n]) Then
            foundsofar := foundsofar + haystack[n];

//  Writeln('foundsofar: ', foundsofar, '  n: ', n, '  haystack: ',haystack );  { trace print  }
          If needle = foundsofar Then
            isFound := True;
						
          {move to next posn in haystack ready to start next itteration}
          haystack := Copy(haystack, n, Length(haystack) );
        End;
      Inc(j);
    End;
		
	{ output result}
  If isFound Then
    Writeln(foundsofar)
  Else
    Writeln('NONE');
		
  Readln; // wait
End.