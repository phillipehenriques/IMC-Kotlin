import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Exemplo de dados
        val saldoEnergia = 100
        val consumoEnergia = 50
        val geracaoEnergia = 80

        val saldoTextView: TextView = findViewById(R.id.saldoTextView)
        val consumoTextView: TextView = findViewById(R.id.consumoTextView)
        val geracaoTextView: TextView = findViewById(R.id.geracaoTextView)

        saldoTextView.text = "Saldo de Energia: $saldoEnergia kWh"
        consumoTextView.text = "Consumo de Energia: $consumoEnergia kWh"
        geracaoTextView.text = "Geração de Energia: $geracaoEnergia kWh"
    }
}
