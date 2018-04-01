(*I think this is right?*)
fun fail x =
	  let
	    val f = fn y => y + x
	  in
	    f
	  end;

fun test () =
  let
    val z = fail 8
  in
    z 3
  end;
