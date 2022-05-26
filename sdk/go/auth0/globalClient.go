// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use a tenant's global Auth0 Application client.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := auth0.NewGlobalClient(ctx, "global", &auth0.GlobalClientArgs{
// 			Callbacks: pulumi.StringArray{
// 				pulumi.String("http://somehostname.com/a/callback"),
// 			},
// 			CustomLoginPage:   pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v", "<html>\n", "    <head><title>My Custom Login Page</title></head>\n", "    <body>\n", "        I should probably have a login form here\n", "    </body>\n", "</html>\n", "\n")),
// 			CustomLoginPageOn: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// The auth0_global_client can be imported using the client's ID. You can find the ID of the global client by going to the [API Explorer](https://auth0.com/docs/api/management/v2#!/Clients/get_clients) and fetching the clients that have `"global"true`.
//
// ```sh
//  $ pulumi import auth0:index/globalClient:GlobalClient global XaiyAXXXYdXXXXnqjj8HXXXXXT5titww
// ```
type GlobalClient struct {
	pulumi.CustomResourceState

	Addons                         GlobalClientAddonsOutput            `pulumi:"addons"`
	AllowedClients                 pulumi.StringArrayOutput            `pulumi:"allowedClients"`
	AllowedLogoutUrls              pulumi.StringArrayOutput            `pulumi:"allowedLogoutUrls"`
	AllowedOrigins                 pulumi.StringArrayOutput            `pulumi:"allowedOrigins"`
	AppType                        pulumi.StringOutput                 `pulumi:"appType"`
	Callbacks                      pulumi.StringArrayOutput            `pulumi:"callbacks"`
	ClientId                       pulumi.StringOutput                 `pulumi:"clientId"`
	ClientMetadata                 pulumi.MapOutput                    `pulumi:"clientMetadata"`
	ClientSecret                   pulumi.StringOutput                 `pulumi:"clientSecret"`
	ClientSecretRotationTrigger    pulumi.MapOutput                    `pulumi:"clientSecretRotationTrigger"`
	CrossOriginAuth                pulumi.BoolOutput                   `pulumi:"crossOriginAuth"`
	CrossOriginLoc                 pulumi.StringOutput                 `pulumi:"crossOriginLoc"`
	CustomLoginPage                pulumi.StringOutput                 `pulumi:"customLoginPage"`
	CustomLoginPageOn              pulumi.BoolOutput                   `pulumi:"customLoginPageOn"`
	Description                    pulumi.StringOutput                 `pulumi:"description"`
	EncryptionKey                  pulumi.StringMapOutput              `pulumi:"encryptionKey"`
	FormTemplate                   pulumi.StringOutput                 `pulumi:"formTemplate"`
	GrantTypes                     pulumi.StringArrayOutput            `pulumi:"grantTypes"`
	InitiateLoginUri               pulumi.StringOutput                 `pulumi:"initiateLoginUri"`
	IsFirstParty                   pulumi.BoolOutput                   `pulumi:"isFirstParty"`
	IsTokenEndpointIpHeaderTrusted pulumi.BoolOutput                   `pulumi:"isTokenEndpointIpHeaderTrusted"`
	JwtConfiguration               GlobalClientJwtConfigurationOutput  `pulumi:"jwtConfiguration"`
	LogoUri                        pulumi.StringOutput                 `pulumi:"logoUri"`
	Mobile                         GlobalClientMobileOutput            `pulumi:"mobile"`
	Name                           pulumi.StringOutput                 `pulumi:"name"`
	NativeSocialLogin              GlobalClientNativeSocialLoginOutput `pulumi:"nativeSocialLogin"`
	OidcConformant                 pulumi.BoolOutput                   `pulumi:"oidcConformant"`
	OrganizationRequireBehavior    pulumi.StringOutput                 `pulumi:"organizationRequireBehavior"`
	OrganizationUsage              pulumi.StringOutput                 `pulumi:"organizationUsage"`
	RefreshToken                   GlobalClientRefreshTokenOutput      `pulumi:"refreshToken"`
	SigningKeys                    pulumi.MapArrayOutput               `pulumi:"signingKeys"`
	Sso                            pulumi.BoolOutput                   `pulumi:"sso"`
	SsoDisabled                    pulumi.BoolOutput                   `pulumi:"ssoDisabled"`
	TokenEndpointAuthMethod        pulumi.StringOutput                 `pulumi:"tokenEndpointAuthMethod"`
	WebOrigins                     pulumi.StringArrayOutput            `pulumi:"webOrigins"`
}

// NewGlobalClient registers a new resource with the given unique name, arguments, and options.
func NewGlobalClient(ctx *pulumi.Context,
	name string, args *GlobalClientArgs, opts ...pulumi.ResourceOption) (*GlobalClient, error) {
	if args == nil {
		args = &GlobalClientArgs{}
	}

	var resource GlobalClient
	err := ctx.RegisterResource("auth0:index/globalClient:GlobalClient", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalClient gets an existing GlobalClient resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalClient(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalClientState, opts ...pulumi.ResourceOption) (*GlobalClient, error) {
	var resource GlobalClient
	err := ctx.ReadResource("auth0:index/globalClient:GlobalClient", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalClient resources.
type globalClientState struct {
	Addons                         *GlobalClientAddons            `pulumi:"addons"`
	AllowedClients                 []string                       `pulumi:"allowedClients"`
	AllowedLogoutUrls              []string                       `pulumi:"allowedLogoutUrls"`
	AllowedOrigins                 []string                       `pulumi:"allowedOrigins"`
	AppType                        *string                        `pulumi:"appType"`
	Callbacks                      []string                       `pulumi:"callbacks"`
	ClientId                       *string                        `pulumi:"clientId"`
	ClientMetadata                 map[string]interface{}         `pulumi:"clientMetadata"`
	ClientSecret                   *string                        `pulumi:"clientSecret"`
	ClientSecretRotationTrigger    map[string]interface{}         `pulumi:"clientSecretRotationTrigger"`
	CrossOriginAuth                *bool                          `pulumi:"crossOriginAuth"`
	CrossOriginLoc                 *string                        `pulumi:"crossOriginLoc"`
	CustomLoginPage                *string                        `pulumi:"customLoginPage"`
	CustomLoginPageOn              *bool                          `pulumi:"customLoginPageOn"`
	Description                    *string                        `pulumi:"description"`
	EncryptionKey                  map[string]string              `pulumi:"encryptionKey"`
	FormTemplate                   *string                        `pulumi:"formTemplate"`
	GrantTypes                     []string                       `pulumi:"grantTypes"`
	InitiateLoginUri               *string                        `pulumi:"initiateLoginUri"`
	IsFirstParty                   *bool                          `pulumi:"isFirstParty"`
	IsTokenEndpointIpHeaderTrusted *bool                          `pulumi:"isTokenEndpointIpHeaderTrusted"`
	JwtConfiguration               *GlobalClientJwtConfiguration  `pulumi:"jwtConfiguration"`
	LogoUri                        *string                        `pulumi:"logoUri"`
	Mobile                         *GlobalClientMobile            `pulumi:"mobile"`
	Name                           *string                        `pulumi:"name"`
	NativeSocialLogin              *GlobalClientNativeSocialLogin `pulumi:"nativeSocialLogin"`
	OidcConformant                 *bool                          `pulumi:"oidcConformant"`
	OrganizationRequireBehavior    *string                        `pulumi:"organizationRequireBehavior"`
	OrganizationUsage              *string                        `pulumi:"organizationUsage"`
	RefreshToken                   *GlobalClientRefreshToken      `pulumi:"refreshToken"`
	SigningKeys                    []map[string]interface{}       `pulumi:"signingKeys"`
	Sso                            *bool                          `pulumi:"sso"`
	SsoDisabled                    *bool                          `pulumi:"ssoDisabled"`
	TokenEndpointAuthMethod        *string                        `pulumi:"tokenEndpointAuthMethod"`
	WebOrigins                     []string                       `pulumi:"webOrigins"`
}

type GlobalClientState struct {
	Addons                         GlobalClientAddonsPtrInput
	AllowedClients                 pulumi.StringArrayInput
	AllowedLogoutUrls              pulumi.StringArrayInput
	AllowedOrigins                 pulumi.StringArrayInput
	AppType                        pulumi.StringPtrInput
	Callbacks                      pulumi.StringArrayInput
	ClientId                       pulumi.StringPtrInput
	ClientMetadata                 pulumi.MapInput
	ClientSecret                   pulumi.StringPtrInput
	ClientSecretRotationTrigger    pulumi.MapInput
	CrossOriginAuth                pulumi.BoolPtrInput
	CrossOriginLoc                 pulumi.StringPtrInput
	CustomLoginPage                pulumi.StringPtrInput
	CustomLoginPageOn              pulumi.BoolPtrInput
	Description                    pulumi.StringPtrInput
	EncryptionKey                  pulumi.StringMapInput
	FormTemplate                   pulumi.StringPtrInput
	GrantTypes                     pulumi.StringArrayInput
	InitiateLoginUri               pulumi.StringPtrInput
	IsFirstParty                   pulumi.BoolPtrInput
	IsTokenEndpointIpHeaderTrusted pulumi.BoolPtrInput
	JwtConfiguration               GlobalClientJwtConfigurationPtrInput
	LogoUri                        pulumi.StringPtrInput
	Mobile                         GlobalClientMobilePtrInput
	Name                           pulumi.StringPtrInput
	NativeSocialLogin              GlobalClientNativeSocialLoginPtrInput
	OidcConformant                 pulumi.BoolPtrInput
	OrganizationRequireBehavior    pulumi.StringPtrInput
	OrganizationUsage              pulumi.StringPtrInput
	RefreshToken                   GlobalClientRefreshTokenPtrInput
	SigningKeys                    pulumi.MapArrayInput
	Sso                            pulumi.BoolPtrInput
	SsoDisabled                    pulumi.BoolPtrInput
	TokenEndpointAuthMethod        pulumi.StringPtrInput
	WebOrigins                     pulumi.StringArrayInput
}

func (GlobalClientState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalClientState)(nil)).Elem()
}

type globalClientArgs struct {
	Addons                         *GlobalClientAddons            `pulumi:"addons"`
	AllowedClients                 []string                       `pulumi:"allowedClients"`
	AllowedLogoutUrls              []string                       `pulumi:"allowedLogoutUrls"`
	AllowedOrigins                 []string                       `pulumi:"allowedOrigins"`
	AppType                        *string                        `pulumi:"appType"`
	Callbacks                      []string                       `pulumi:"callbacks"`
	ClientId                       *string                        `pulumi:"clientId"`
	ClientMetadata                 map[string]interface{}         `pulumi:"clientMetadata"`
	ClientSecret                   *string                        `pulumi:"clientSecret"`
	ClientSecretRotationTrigger    map[string]interface{}         `pulumi:"clientSecretRotationTrigger"`
	CrossOriginAuth                *bool                          `pulumi:"crossOriginAuth"`
	CrossOriginLoc                 *string                        `pulumi:"crossOriginLoc"`
	CustomLoginPage                *string                        `pulumi:"customLoginPage"`
	CustomLoginPageOn              *bool                          `pulumi:"customLoginPageOn"`
	Description                    *string                        `pulumi:"description"`
	EncryptionKey                  map[string]string              `pulumi:"encryptionKey"`
	FormTemplate                   *string                        `pulumi:"formTemplate"`
	GrantTypes                     []string                       `pulumi:"grantTypes"`
	InitiateLoginUri               *string                        `pulumi:"initiateLoginUri"`
	IsFirstParty                   *bool                          `pulumi:"isFirstParty"`
	IsTokenEndpointIpHeaderTrusted *bool                          `pulumi:"isTokenEndpointIpHeaderTrusted"`
	JwtConfiguration               *GlobalClientJwtConfiguration  `pulumi:"jwtConfiguration"`
	LogoUri                        *string                        `pulumi:"logoUri"`
	Mobile                         *GlobalClientMobile            `pulumi:"mobile"`
	Name                           *string                        `pulumi:"name"`
	NativeSocialLogin              *GlobalClientNativeSocialLogin `pulumi:"nativeSocialLogin"`
	OidcConformant                 *bool                          `pulumi:"oidcConformant"`
	OrganizationRequireBehavior    *string                        `pulumi:"organizationRequireBehavior"`
	OrganizationUsage              *string                        `pulumi:"organizationUsage"`
	RefreshToken                   *GlobalClientRefreshToken      `pulumi:"refreshToken"`
	SigningKeys                    []map[string]interface{}       `pulumi:"signingKeys"`
	Sso                            *bool                          `pulumi:"sso"`
	SsoDisabled                    *bool                          `pulumi:"ssoDisabled"`
	TokenEndpointAuthMethod        *string                        `pulumi:"tokenEndpointAuthMethod"`
	WebOrigins                     []string                       `pulumi:"webOrigins"`
}

// The set of arguments for constructing a GlobalClient resource.
type GlobalClientArgs struct {
	Addons                         GlobalClientAddonsPtrInput
	AllowedClients                 pulumi.StringArrayInput
	AllowedLogoutUrls              pulumi.StringArrayInput
	AllowedOrigins                 pulumi.StringArrayInput
	AppType                        pulumi.StringPtrInput
	Callbacks                      pulumi.StringArrayInput
	ClientId                       pulumi.StringPtrInput
	ClientMetadata                 pulumi.MapInput
	ClientSecret                   pulumi.StringPtrInput
	ClientSecretRotationTrigger    pulumi.MapInput
	CrossOriginAuth                pulumi.BoolPtrInput
	CrossOriginLoc                 pulumi.StringPtrInput
	CustomLoginPage                pulumi.StringPtrInput
	CustomLoginPageOn              pulumi.BoolPtrInput
	Description                    pulumi.StringPtrInput
	EncryptionKey                  pulumi.StringMapInput
	FormTemplate                   pulumi.StringPtrInput
	GrantTypes                     pulumi.StringArrayInput
	InitiateLoginUri               pulumi.StringPtrInput
	IsFirstParty                   pulumi.BoolPtrInput
	IsTokenEndpointIpHeaderTrusted pulumi.BoolPtrInput
	JwtConfiguration               GlobalClientJwtConfigurationPtrInput
	LogoUri                        pulumi.StringPtrInput
	Mobile                         GlobalClientMobilePtrInput
	Name                           pulumi.StringPtrInput
	NativeSocialLogin              GlobalClientNativeSocialLoginPtrInput
	OidcConformant                 pulumi.BoolPtrInput
	OrganizationRequireBehavior    pulumi.StringPtrInput
	OrganizationUsage              pulumi.StringPtrInput
	RefreshToken                   GlobalClientRefreshTokenPtrInput
	SigningKeys                    pulumi.MapArrayInput
	Sso                            pulumi.BoolPtrInput
	SsoDisabled                    pulumi.BoolPtrInput
	TokenEndpointAuthMethod        pulumi.StringPtrInput
	WebOrigins                     pulumi.StringArrayInput
}

func (GlobalClientArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalClientArgs)(nil)).Elem()
}

type GlobalClientInput interface {
	pulumi.Input

	ToGlobalClientOutput() GlobalClientOutput
	ToGlobalClientOutputWithContext(ctx context.Context) GlobalClientOutput
}

func (*GlobalClient) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalClient)(nil)).Elem()
}

func (i *GlobalClient) ToGlobalClientOutput() GlobalClientOutput {
	return i.ToGlobalClientOutputWithContext(context.Background())
}

func (i *GlobalClient) ToGlobalClientOutputWithContext(ctx context.Context) GlobalClientOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalClientOutput)
}

// GlobalClientArrayInput is an input type that accepts GlobalClientArray and GlobalClientArrayOutput values.
// You can construct a concrete instance of `GlobalClientArrayInput` via:
//
//          GlobalClientArray{ GlobalClientArgs{...} }
type GlobalClientArrayInput interface {
	pulumi.Input

	ToGlobalClientArrayOutput() GlobalClientArrayOutput
	ToGlobalClientArrayOutputWithContext(context.Context) GlobalClientArrayOutput
}

type GlobalClientArray []GlobalClientInput

func (GlobalClientArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalClient)(nil)).Elem()
}

func (i GlobalClientArray) ToGlobalClientArrayOutput() GlobalClientArrayOutput {
	return i.ToGlobalClientArrayOutputWithContext(context.Background())
}

func (i GlobalClientArray) ToGlobalClientArrayOutputWithContext(ctx context.Context) GlobalClientArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalClientArrayOutput)
}

// GlobalClientMapInput is an input type that accepts GlobalClientMap and GlobalClientMapOutput values.
// You can construct a concrete instance of `GlobalClientMapInput` via:
//
//          GlobalClientMap{ "key": GlobalClientArgs{...} }
type GlobalClientMapInput interface {
	pulumi.Input

	ToGlobalClientMapOutput() GlobalClientMapOutput
	ToGlobalClientMapOutputWithContext(context.Context) GlobalClientMapOutput
}

type GlobalClientMap map[string]GlobalClientInput

func (GlobalClientMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalClient)(nil)).Elem()
}

func (i GlobalClientMap) ToGlobalClientMapOutput() GlobalClientMapOutput {
	return i.ToGlobalClientMapOutputWithContext(context.Background())
}

func (i GlobalClientMap) ToGlobalClientMapOutputWithContext(ctx context.Context) GlobalClientMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalClientMapOutput)
}

type GlobalClientOutput struct{ *pulumi.OutputState }

func (GlobalClientOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalClient)(nil)).Elem()
}

func (o GlobalClientOutput) ToGlobalClientOutput() GlobalClientOutput {
	return o
}

func (o GlobalClientOutput) ToGlobalClientOutputWithContext(ctx context.Context) GlobalClientOutput {
	return o
}

func (o GlobalClientOutput) Addons() GlobalClientAddonsOutput {
	return o.ApplyT(func(v *GlobalClient) GlobalClientAddonsOutput { return v.Addons }).(GlobalClientAddonsOutput)
}

func (o GlobalClientOutput) AllowedClients() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringArrayOutput { return v.AllowedClients }).(pulumi.StringArrayOutput)
}

func (o GlobalClientOutput) AllowedLogoutUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringArrayOutput { return v.AllowedLogoutUrls }).(pulumi.StringArrayOutput)
}

func (o GlobalClientOutput) AllowedOrigins() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringArrayOutput { return v.AllowedOrigins }).(pulumi.StringArrayOutput)
}

func (o GlobalClientOutput) AppType() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.AppType }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) Callbacks() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringArrayOutput { return v.Callbacks }).(pulumi.StringArrayOutput)
}

func (o GlobalClientOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) ClientMetadata() pulumi.MapOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.MapOutput { return v.ClientMetadata }).(pulumi.MapOutput)
}

func (o GlobalClientOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.ClientSecret }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) ClientSecretRotationTrigger() pulumi.MapOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.MapOutput { return v.ClientSecretRotationTrigger }).(pulumi.MapOutput)
}

func (o GlobalClientOutput) CrossOriginAuth() pulumi.BoolOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.BoolOutput { return v.CrossOriginAuth }).(pulumi.BoolOutput)
}

func (o GlobalClientOutput) CrossOriginLoc() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.CrossOriginLoc }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) CustomLoginPage() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.CustomLoginPage }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) CustomLoginPageOn() pulumi.BoolOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.BoolOutput { return v.CustomLoginPageOn }).(pulumi.BoolOutput)
}

func (o GlobalClientOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) EncryptionKey() pulumi.StringMapOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringMapOutput { return v.EncryptionKey }).(pulumi.StringMapOutput)
}

func (o GlobalClientOutput) FormTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.FormTemplate }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) GrantTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringArrayOutput { return v.GrantTypes }).(pulumi.StringArrayOutput)
}

func (o GlobalClientOutput) InitiateLoginUri() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.InitiateLoginUri }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) IsFirstParty() pulumi.BoolOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.BoolOutput { return v.IsFirstParty }).(pulumi.BoolOutput)
}

func (o GlobalClientOutput) IsTokenEndpointIpHeaderTrusted() pulumi.BoolOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.BoolOutput { return v.IsTokenEndpointIpHeaderTrusted }).(pulumi.BoolOutput)
}

func (o GlobalClientOutput) JwtConfiguration() GlobalClientJwtConfigurationOutput {
	return o.ApplyT(func(v *GlobalClient) GlobalClientJwtConfigurationOutput { return v.JwtConfiguration }).(GlobalClientJwtConfigurationOutput)
}

func (o GlobalClientOutput) LogoUri() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.LogoUri }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) Mobile() GlobalClientMobileOutput {
	return o.ApplyT(func(v *GlobalClient) GlobalClientMobileOutput { return v.Mobile }).(GlobalClientMobileOutput)
}

func (o GlobalClientOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) NativeSocialLogin() GlobalClientNativeSocialLoginOutput {
	return o.ApplyT(func(v *GlobalClient) GlobalClientNativeSocialLoginOutput { return v.NativeSocialLogin }).(GlobalClientNativeSocialLoginOutput)
}

func (o GlobalClientOutput) OidcConformant() pulumi.BoolOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.BoolOutput { return v.OidcConformant }).(pulumi.BoolOutput)
}

func (o GlobalClientOutput) OrganizationRequireBehavior() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.OrganizationRequireBehavior }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) OrganizationUsage() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.OrganizationUsage }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) RefreshToken() GlobalClientRefreshTokenOutput {
	return o.ApplyT(func(v *GlobalClient) GlobalClientRefreshTokenOutput { return v.RefreshToken }).(GlobalClientRefreshTokenOutput)
}

func (o GlobalClientOutput) SigningKeys() pulumi.MapArrayOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.MapArrayOutput { return v.SigningKeys }).(pulumi.MapArrayOutput)
}

func (o GlobalClientOutput) Sso() pulumi.BoolOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.BoolOutput { return v.Sso }).(pulumi.BoolOutput)
}

func (o GlobalClientOutput) SsoDisabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.BoolOutput { return v.SsoDisabled }).(pulumi.BoolOutput)
}

func (o GlobalClientOutput) TokenEndpointAuthMethod() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringOutput { return v.TokenEndpointAuthMethod }).(pulumi.StringOutput)
}

func (o GlobalClientOutput) WebOrigins() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GlobalClient) pulumi.StringArrayOutput { return v.WebOrigins }).(pulumi.StringArrayOutput)
}

type GlobalClientArrayOutput struct{ *pulumi.OutputState }

func (GlobalClientArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalClient)(nil)).Elem()
}

func (o GlobalClientArrayOutput) ToGlobalClientArrayOutput() GlobalClientArrayOutput {
	return o
}

func (o GlobalClientArrayOutput) ToGlobalClientArrayOutputWithContext(ctx context.Context) GlobalClientArrayOutput {
	return o
}

func (o GlobalClientArrayOutput) Index(i pulumi.IntInput) GlobalClientOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalClient {
		return vs[0].([]*GlobalClient)[vs[1].(int)]
	}).(GlobalClientOutput)
}

type GlobalClientMapOutput struct{ *pulumi.OutputState }

func (GlobalClientMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalClient)(nil)).Elem()
}

func (o GlobalClientMapOutput) ToGlobalClientMapOutput() GlobalClientMapOutput {
	return o
}

func (o GlobalClientMapOutput) ToGlobalClientMapOutputWithContext(ctx context.Context) GlobalClientMapOutput {
	return o
}

func (o GlobalClientMapOutput) MapIndex(k pulumi.StringInput) GlobalClientOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalClient {
		return vs[0].(map[string]*GlobalClient)[vs[1].(string)]
	}).(GlobalClientOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalClientInput)(nil)).Elem(), &GlobalClient{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalClientArrayInput)(nil)).Elem(), GlobalClientArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalClientMapInput)(nil)).Elem(), GlobalClientMap{})
	pulumi.RegisterOutputType(GlobalClientOutput{})
	pulumi.RegisterOutputType(GlobalClientArrayOutput{})
	pulumi.RegisterOutputType(GlobalClientMapOutput{})
}
