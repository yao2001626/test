class M
	initialization (a : int) a = 0
	method add1 when a==0 do begin a = a + 1 end
	action add2 when a==1 do begin a = a + 2 end
end