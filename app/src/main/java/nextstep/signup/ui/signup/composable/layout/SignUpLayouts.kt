package nextstep.signup.ui.signup.composable.layout


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nextstep.signup.R
import nextstep.signup.ui.common.button.StateButton
import nextstep.signup.ui.common.textfield.InputType
import nextstep.signup.ui.common.textfield.OneLineTextInput
import nextstep.signup.ui.signup.composable.text.SignUpTitle
import nextstep.signup.ui.theme.SignupTheme

@Preview(showBackground = true)
@Composable
fun SignUpLayoutPreview() {
    SignupTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            color = MaterialTheme.colorScheme.background
        ) {
            SignUpInteractionLayer {}
        }
    }
}

@Composable
fun SignUpTextFields() {
    Column(
        modifier = Modifier
            .heightIn(min = 350.dp, max = 640.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OneLineTextInput(
            label = stringResource(id = R.string.signup_username),
            inputType = InputType.USERNAME
        )
        OneLineTextInput(
            label = stringResource(id = R.string.signup_email),
            inputType = InputType.EMAIL
        )
        OneLineTextInput(
            label = stringResource(id = R.string.signup_password),
            inputType = InputType.PASSWORD
        )
        OneLineTextInput(
            label = stringResource(id = R.string.signup_password_confirm),
            inputType = InputType.PASSWORD
        )
    }
}

@Composable
fun SignUpInteractionLayer(
    onButtonClicked: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxHeight(0.7f),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SignUpTextFields()
        StateButton(text = stringResource(id = R.string.signup_signup)) {
            onButtonClicked()
        }
    }
}

@Composable
fun SignUpLayout(
    onButtonClicked: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxHeight(0.7f),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SignUpTitle()
        SignUpInteractionLayer {
            onButtonClicked()
        }
    }
}
