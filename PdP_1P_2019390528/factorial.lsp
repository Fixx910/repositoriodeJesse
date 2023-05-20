;Integrantes: 
;Saucillo González Jesse Obed4
;Flores Lara Alberto
;Luna Zamora Juan Antonio

(defun factorial (n)
  (if (<= n 1)
      1
      (* n (factorial (- n 1)))))

(defun leer-numero ()
  (format t "Ingrese un número: ")
  (read))

(defun leer-opcion ()
  (format t "¿Desea calcular otro factorial? (S/N): ")
  (read-char))

(defun calcular-factoriales ()
  (loop
   (let* ((numero (leer-numero))
          (resultado (factorial numero)))
     (format t "El factorial de ~a es ~a~%" numero resultado))
   (let ((opcion (leer-opcion)))
     (unless (char-equal opcion #\s)
       (return)))))

(calcular-factoriales)
