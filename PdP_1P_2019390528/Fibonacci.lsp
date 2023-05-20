;Integrantes: 
;Saucillo González Jesse Obed4
;Flores Lara Alberto
;Luna Zamora Juan Antonio

(defun fibonacci (n)
  (if (<= n 1)
      n
      (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

(defun leer-numero ()
  (format t "Ingrese el número máximo para calcular la secuencia de Fibonacci: ")
  (read))

(defun calcular-fibonacci ()
  (let* ((numero-maximo (leer-numero)))
    (dotimes (i numero-maximo)
      (print (fibonacci i)))))

(calcular-fibonacci)

