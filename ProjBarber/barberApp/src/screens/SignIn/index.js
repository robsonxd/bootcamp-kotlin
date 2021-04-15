import React, { useState } from 'react';
import { useNavigation } from '@react-navigation/native';
import AsyncStorage from 'react-native-community/async-storage';
import { 
    Container,
    InputArea,
    CustomButton,
    CustomButtonText,
    SignMessageButton,
    SignMessageButtonText,
    SignMessageButtonTextBold
} from './styles';

import Api from '../../Api';

import SignInput from '../../components/SignInput';

import BarberLogo from '../../assets/barber.svg';
import EmailIcon from '../../assets/email.svg';
import LockIcon from '../../assets/lock.svg';

export default () => {

    const navigation = useNavigation();

    const [emailField, setEmailField] = useState('');
    const [passwordField, setpasswordField] = useState('');

    const handleSignClick  = async () => {
        if(emailField != '' && passwordField != '') {
            

            let json = await Api.signIn(emailField, passwordField);
            
            if(json.token) {
                await AsyncStorage.setItem('token', json.token);
            } else {
                alert('E-mail e/ou senha errados!');
            }

        } else {
            alert("Preencha os campos!");
        }
    }


    const handleMessageButtonClick = () => {
        //vai jogar o usuário para tela de cadastro
        navigation.reset({
            routes: [{name: 'SignUp'}]
        });
    }

    return (
        <Container>
            <BarberLogo width="100%" height="160" /> 
            
            <InputArea>
                <SignInput 
                    IconSvg={EmailIcon}
                    placeholder="Digite seu e-mail"
                    value={emailField}
                    onChangeText={t=>setEmailField(t)}
                />
            

                <SignInput 
                    IconSvg={LockIcon}
                    placeholder="Digite sua senha"
                    value={passwordField}
                    onChangeText={t=>setpasswordField(t)}
                    password={true}
                />


                <CustomButton onPress={handleSignClick} >
                    <CustomButtonText>LOGIN</CustomButtonText>    
                </CustomButton>           
            </InputArea>

            <SignMessageButton onPress={handleMessageButtonClick} >
                <SignMessageButtonText>Ainda não possui uma conta?</SignMessageButtonText>
                <SignMessageButtonTextBold>Cadastre-se</SignMessageButtonTextBold>
            </SignMessageButton>


        </Container>
    );
}