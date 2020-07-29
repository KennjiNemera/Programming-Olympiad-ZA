program primenum;

{$APPTYPE CONSOLE}

Uses
SysUtils;

Var
  i, n, num : Int64;

Function isPrime (p: Int64): Boolean;

Var
  x : Int64;

Begin
  If (p < 2) Then
    begin
      isPrime := False;
      exit;
    end;
  x := 2;
  While (x * x <= p) Do
    Begin
      If (p Mod x = 0) Then
      begin
        isPrime := False;
        exit;
      end;
      Inc(x);
    End;
  isPrime := True;
End;

Function isRightTruncatable (n: Int64): Boolean;

Begin
	while (n > 0) Do
	Begin
		if (not isPrime(n)) Then
		Begin
			isRightTruncatable :=  False;
			exit;
		end;
		n := n div 10;
	End;
	isRightTruncatable := True;
End;

Begin
  Readln(n);
  i := 1;
  num := 0;
  While (num < n) Do
    Begin
      If (isRightTruncatable(i)) Then Inc(num);
      Inc(i);
    End;
  Writeln(i-1);
End.