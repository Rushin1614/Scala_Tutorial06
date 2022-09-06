object Questions0102 extends App {

  def Encryption( ) : String = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
    val inputText = scala.io.StdIn.readLine("Your Message: ")
    val outputText = inputText.map( (c: Char) => {
      val x = alphabet.indexOf(c.toUpper)
      if (x == -1){
        c
      }
      else{
        alphabet((x + shift) % alphabet.size)
      }
    });
    println("Secret Message is: "+ outputText);
    return outputText;
  }

  def Decryption( ) : String = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
    val inputText = scala.io.StdIn.readLine("Your Message: ")
    val outputText = inputText.map( (c: Char) => {
      val x = alphabet.indexOf(c.toUpper)
      if (x == -1){
        c
      }
      else{
        alphabet((x - shift) % alphabet.size)
      }
    });
    println("Secret Message is: "+ outputText);
    return outputText;
  }

  print("Encrypt(E) or Decrypt(D): ");
  val y = scala.io.StdIn.readLine();
  if(y== "E"){
    Encryption();
  }
  else if (y== "D"){
    Decryption();
  }
  else {
    println("Input is Invalid!");
  }

}



