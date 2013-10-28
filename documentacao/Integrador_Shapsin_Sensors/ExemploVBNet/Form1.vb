Public Class Form1



    Private Sub Button1_Click(sender As System.Object, e As System.EventArgs) Handles Button1.Click
        'Bloqueia botão para evitar duplo clique do usuario
        Button1.Enabled = False
        Application.DoEvents()


        'cria objeto WEBSERVICE dos Sensores
        Dim _web As New SensorsService.SensorsService

        'cria array de strings para receber a lista
        Dim lista As String()


        'Recebe da funcao do WebService os Estados dos sensores
        '
        ' Cada linha está separada com ;
        '
        '   <id do sensor>;<estado>

        lista = _web.RetornaListaEstados()



        'Coloca lista no ListBox
        ListBox1.Items.Clear()
        ListBox1.Items.AddRange(lista)



        Button1.Enabled = True
    End Sub

    Private Sub Button2_Click(sender As System.Object, e As System.EventArgs) Handles Button2.Click
        'Bloqueia botão para evitar duplo clique do usuario
        Button2.Enabled = False
        Application.DoEvents()


        'cria objeto WEBSERVICE dos Sensores
        Dim _web As New SensorsService.SensorsService

        'cria array de strings para receber a lista
        Dim lista As String()


        'Recebe da funcao do WebService os lista de sensores
        lista = _web.RetornaListaDeSensores()



        'Coloca lista no ListBox
        ListBox1.Items.Clear()
        ListBox1.Items.AddRange(lista)



        Button2.Enabled = True
    End Sub

    Private Sub Button3_Click(sender As System.Object, e As System.EventArgs) Handles Button3.Click

        'cria objeto WEBSERVICE dos Sensores
        Dim _web As New SensorsService.SensorsService

        Dim estado As Integer

        estado = _web.EstadoSensor(TextBox1.Text)

        If estado = 0 Then
            MsgBox("Liberado")
        ElseIf estado = 1 Then
            MsgBox("Ocupado")
        ElseIf estado = -1 Then
            MsgBox("Vaga não encontrada")
        End If


    End Sub
End Class
